package br.com.abc.javacore.blocodeinicializacao.classes;

public class Cliente {
    private int[] parcelas = {1,2,3,4,5,6,7,8,9,10};

    {
        System.out.println("Dentro do inicializador");
        parcelas = new int[100];
        for(int i = 1;i<=100;i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente(){
        for(int parcelas : this.parcelas){
            System.out.println(parcelas + " ");
        }
    }

    /**
     * @return the parcelas
     */
    public int[] getParcelas() {
        return parcelas;
    }

    /**
     * @param parcelas the parcelas to set
     */
    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }


}