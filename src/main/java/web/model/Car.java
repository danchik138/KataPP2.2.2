package web.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", version='" + version + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    private String model;
    private String version;
    private String owner;

    public Car(String model, String version, String owner) {
        this.model = model;
        this.version = version;
        this.owner = owner;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
