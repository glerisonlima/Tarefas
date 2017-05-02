import java.sql.Connection;

import br.com.tarefas.dao.ConnectionFactory;

public class TesteConneciton {

	public static void main(String[] args) {
		try{
		Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Conectado com sucesso!");
		}catch (Exception e) {
			System.out.println("Problema ao conectar");
		}
	}
}
