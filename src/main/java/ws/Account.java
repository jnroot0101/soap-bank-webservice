package ws;

import java.util.Date;

public class Account {
    private int code;
    private double balance;
    private Date CreatedAt;

    public Account() {

    }

    public Account(int code, double balance, Date createdAt) {
        this.code = code;
        this.balance = balance;
        this.CreatedAt = createdAt;
    }
    
    public int getCode() {
        return code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public Date getCreatedAt() {
        return CreatedAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.CreatedAt = createdAt;
    }
}
