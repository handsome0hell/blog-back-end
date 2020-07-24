package tk.handsome0hell.blog.permission;

import tk.handsome0hell.blog.pojo.User;

class DatabasePermissionComponent implements PermissionComponent {
  @Override
  public Boolean HasLogined(UserIdRepository repository) {
    return (repository.getUserId() != null);
  }
};
