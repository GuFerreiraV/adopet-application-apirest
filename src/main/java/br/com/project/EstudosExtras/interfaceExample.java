package br.com.project.EstudosExtras;

public interface interfaceExample {

    void exampleAbstract();
    // O método abstrato, obrigatoriamente, tem que ser implementado por uma classe concreta


    static void exampleStatic(){
        System.out.println("Apenas testando o método estático");
            /*
            O métodos estáticos não precisam ser reimplementados na classe concreta
            Pode definir outro comportamento para estes métodos na classe concreta, caso queira
             */
    }
    default void exampleDefault(){
        System.out.println("Apenas testando o método estático");
    /*
     O métodos default não precisam ser reimplementados na classe concreta,
     porém, pode definir outro comportamento para estes métodos na classe concreta.
    */
    }
}
