class Referencia {
	private Aluno a1, a2;

	public Referencia(){
        a1 = new ALuno ("carlos" , 20);
        a2 = new ALuno ("Ana", 23);
        System.out.println("O nome do aluno a1" + a1);
        System.out.println("O nome do aluno a1" + a2);

        a2 = a1 ;

        a2.definirNome("Flávia");
        System.out.println("o nome do aluno a1 é" + a1.recuperar());
	    manipuladoAluno(a1);
	System.out.println("o nome do aluno a1 é" + a1 recuperarnome());
    }

	public void manipulluno(Aluno aluno) {
		aluno.definirNome("Márcia");
	}

}}
