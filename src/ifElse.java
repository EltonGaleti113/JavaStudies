public class ifElse {
    public static void main(String[]args){
        int meta = 1500;
        int faturamentoMensal = 200;

        if (faturamentoMensal>meta){
            System.out.println("Meta Atingida! :D \nO faturamento foi de ->" + faturamentoMensal);
        } else {
            System.out.println("A meta não foi atingida :( \nO faturamento foi de ->" + faturamentoMensal);
        }
    }
}
