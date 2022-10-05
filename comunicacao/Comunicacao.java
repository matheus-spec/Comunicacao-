package comunicacao;
public class Comunicacao {
    public static void main(String[] args) {
        mensagemUm();
        System.out.printf("\n");
        mensagemDois(5);
        System.out.printf("\n");
        mensagemTres(5,"MÉTODOS EM JAVA");
        System.out.printf("\n");
        mensagemTres(4,"PATO BRANCO/PR");
    }
    
    public static void mensagemUm(){
        int i;
        for(i=1; i<=3; i++){
            System.out.printf("%d- DevMedia | Canal Java\n", i);
        }
    }
    
    public static void mensagemDois(int n){
        int i;
        for(i=1;i<=n;i++){
            System.out.printf("%d- DevMedia | Canal Java\n", i);
        }
    }
    
    public static void mensagemTres(int n, String s){
        int i;
        for (i=1; i<=n; i++){
            System.out.printf("%d- %s\n", i, s);
        }
    }
}
