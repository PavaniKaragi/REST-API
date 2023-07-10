package Rest.Webservices.Restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {

	// /hello-world

	// "Hello World"

	// @RequestMapping(method = RequestMethod.GET, path = "/hello-world")

	@GetMapping(path = "/hello-world")
	public String helloworld() {
		return "Hello World!!";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World!!");
	}

	// path parameters
	// /users/{id}/tools/{id}=>/users/2/todos/200
	// /hello-world/path-variable/{name}
	// /hello-world/path-variable/pavani

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello world, %s", name));
	}
}
