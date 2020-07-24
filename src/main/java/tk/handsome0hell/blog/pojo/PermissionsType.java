package tk.handsome0hell.blog.pojo;

public enum PermissionsType {
  kAddUser(1, "AddUser");

  private Integer id;
  private String name;
  private PermissionsType(Integer id, String name) {
    this.id = id;
    this.name = name;
  }
  public Integer getId() { return id; }
  public String getName() { return name; }
  @Override
  public String toString() { return name; }
}