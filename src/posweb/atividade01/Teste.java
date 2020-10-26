package posweb.atividade01;

public class Teste {
	
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setNome("Primeiro Curso");
		CursoCRUD.salvar(curso);
		System.out.println(curso);
	}

}
