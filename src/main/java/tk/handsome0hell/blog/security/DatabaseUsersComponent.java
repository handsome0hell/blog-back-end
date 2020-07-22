package tk.handsome0hell.blog.security;

import tk.handsome0hell.blog.pojo.User;

class DatabaseUsersComponent implements UsersComponent {
  private Boolean is_logined;
  private UsersRepository users_repository;
  public DatabaseUsersComponent(UsersRepository users_repository) {
    this.users_repository = users_repository;
    is_logined = false;
  };
  @Override
  public Boolean IsLogined() {
    return is_logined;
  };
  @Override
  public Boolean Login(User user) {
    is_logined = users_repository.ValidateUser(user); 
    return is_logined;
  };
  @Override
  public Boolean Logout() {
    is_logined = false;
    return true;
  };
};