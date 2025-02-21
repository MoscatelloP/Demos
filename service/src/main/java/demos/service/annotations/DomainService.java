package demos.service.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This annotation is used to mark a class as a service entity to be managed by an external DI framework
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DomainService {
}
