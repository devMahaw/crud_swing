package crud_swing.dao;

import crud_swing.domain.Client;

import java.util.Collection;

public interface IClientDAO {

    public Boolean register(Client client);
    public void delete(String cpf);
    public void change(Client client);
    public Client consult(String cpf);
    public Collection<Client> searchAll();
}
