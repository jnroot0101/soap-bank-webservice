package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(name = "BankWS")
public class BankService {
    @WebMethod(operationName = "convertEuroToMad")
    public double conversion(@WebParam(name = "amount") double am){
        return am * 11;
    }

    @WebMethod
    public Account getAccount(int code) {
        return new Account(code, 1000, new java.util.Date());
    }

    @WebMethod
    public List<Account> getAccounts() {
        return List.of(
                new Account(1, 1000 + Math.random()*9000, new Date()),
                new Account(1, 1000 + Math.random()*9000, new Date()),
                new Account(1, 1000 + Math.random()*9000, new Date())
        );
    }
}
