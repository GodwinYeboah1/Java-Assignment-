public abstract class Phone{
    private String models;
    private String carrier;
    private String os;
    private Double price;
    private String number;

    public void setModel(String model){
        this.models = model;

    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
        
    }
    public void setOS(String os){
        this.os = os;
    }
    public void setPrice(Double price){
        this.price = price;
    }

    // getter
    public String getModel(){
        return models;
    }

    public String getCarrier(){
        return carrier;
    }

    public String getOs(){
        return os;
    }
}