package tk.handsome0hell.blog.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tk.handsome0hell.blog.pojo.Role;
import tk.handsome0hell.blog.pojo.Permission;
import tk.handsome0hell.blog.roles.RolesComponent;
import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolesPresenter {
  private RolesComponent roles_component;
  public RolesPresenter(RolesComponent roles_component) {
    this.roles_component = roles_component;
  }
  @GetMapping("")
  public List<Role> GetRoles() {
    return roles_component.GetRoles();
  }
  @GetMapping("{id}")
  public List<Permission> GetPermissionsOfRole(
      @PathVariable("id") Integer role_id) {
    Role role = new Role();
    role.setId(role_id);
    return roles_component.GetPermissionsOfRole(role);
  }
  @PostMapping("{id}")
  Boolean AddPermissionToRole(
      @PathVariable("id") Integer role_id,
      @RequestBody Permission permission) {
    Role role = new Role();
    role.setId(role_id);
    return roles_component.AddPermissionToRole(permission, role);
  }
  @DeleteMapping("{role_id}/{permission_id}")
  Boolean DeletePermissionFromRole(
      @PathVariable Integer permission_id,
      @PathVariable Integer role_id) {
    Role role = new Role();
    role.setId(role_id);
    Permission permission = new Permission();
    permission.setId(permission_id);
    return roles_component.DeletePermissionFromRole(permission, role);
  }
}
