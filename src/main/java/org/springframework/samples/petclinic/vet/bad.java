import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(SecurityConfig.class, args);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disabling CSRF protection
            .authorizeRequests()
            .antMatchers("/").permitAll()
            .anyRequest().authenticated();
    }
}
