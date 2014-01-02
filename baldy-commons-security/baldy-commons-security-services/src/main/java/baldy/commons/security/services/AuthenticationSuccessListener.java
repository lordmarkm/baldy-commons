package baldy.commons.security.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;

/**
 * Generic authentication success listener, only logs event
 * @author mbmartinez
 */
public class AuthenticationSuccessListener implements ApplicationListener<InteractiveAuthenticationSuccessEvent> {

	private static Logger log = LoggerFactory.getLogger(AuthenticationSuccessListener.class);

	@Override
	public void onApplicationEvent(InteractiveAuthenticationSuccessEvent event) {

	    Authentication auth = event.getAuthentication();
		log.info("Authentication success event. auth={}", auth);

//      do this at on the application level
//		User user = (User) auth.getPrincipal();
//		accounts.updateLastLogin(user.getUsername());

	}

}
