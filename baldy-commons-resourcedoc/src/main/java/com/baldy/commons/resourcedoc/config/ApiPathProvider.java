package com.baldy.commons.resourcedoc.config;

import com.mangofactory.swagger.core.SwaggerPathProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.ServletContext;

/**
 * http://www.therichwebexperience.com/blog/matt_raible/2014/03/documenting_your_spring_api_with_swagger
 * @author mbmartinez
 */
public class ApiPathProvider implements SwaggerPathProvider {

    private SwaggerPathProvider defaultSwaggerPathProvider;

    @Autowired
    private ServletContext servletContext;

    private String docsLocation;

    public ApiPathProvider(String docsLocation) {
        this.docsLocation = docsLocation;
    }

    @Override
    public String getApiResourcePrefix() {
        return defaultSwaggerPathProvider.getApiResourcePrefix();
    }

    public String getAppBasePath() {
        return UriComponentsBuilder
                .fromHttpUrl(docsLocation)
                .path(servletContext.getContextPath())
                .build()
                .toString();
    }

    @Override
    public String getSwaggerDocumentationBasePath() {
        return UriComponentsBuilder
                .fromHttpUrl(getAppBasePath())
                .pathSegment("api-docs/")
                .build()
                .toString();
    }

    @Override
    public String getRequestMappingEndpoint(String requestMappingPattern) {
        return defaultSwaggerPathProvider.getRequestMappingEndpoint(requestMappingPattern);
    }

    public void setDefaultSwaggerPathProvider(SwaggerPathProvider defaultSwaggerPathProvider) {
        this.defaultSwaggerPathProvider = defaultSwaggerPathProvider;
    }
}