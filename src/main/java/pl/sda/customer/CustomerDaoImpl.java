package pl.sda.customer;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
