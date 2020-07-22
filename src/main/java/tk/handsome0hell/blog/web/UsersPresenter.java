package tk.handsome0hell.blog.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tk.handsome0hell.blog.pojo.User;
import tk.handsome0hell.blog.security.UsersComponent;

@RestController
@RequestMapping("/users")
public class UsersPresenter {
  private UsersComponent users_component;
  public UsersPresenter(UsersComponent users_component) {
    this.users_component = users_component;
  }
  @GetMapping("login")
  public Boolean IsLogin() {
    return users_component.IsLogined();
  };
  @PutMapping("login")
  public Boolean Login(@RequestBody User user) {
    return users_component.Login(user);
  };
  @DeleteMapping("login")
  public Boolean Logout() {
    return users_component.Logout();
  };
}