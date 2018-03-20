class Project{
    private String name;
    private String description;

    // method constructor 
    // overloaded 
    // construct empyt object
    public Project(){
    }
    // construct object with name
    public Project(String name){
        this.name = name;
    }
     // construct object with name and description
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    // getter 
    // always return 
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    // setter
    // Never return
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }

}