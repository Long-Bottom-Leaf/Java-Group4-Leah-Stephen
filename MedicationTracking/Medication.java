package MedicationTracking;

import java.util.concurrent.atomic.AtomicInteger;
import java.time.LocalDate;

public class Medication {
    private static final AtomicInteger ID_GEN = new AtomicInteger(0);
    private final int id;
    private String name;
    private String dose;
    private int quantityInStock;
    private LocalDate expirationDate;

    public Medication(String name, String dose, int quantityInStock, LocalDate expirationDate) {
        this.id = ID_GEN.getAndIncrement();
        this.name = name;
        this.dose = dose;
        this.quantityInStock = quantityInStock;
        this.expirationDate = expirationDate;
    }

    // Accessors
    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDose() {
        return dose;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    
    // Mutator
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}
