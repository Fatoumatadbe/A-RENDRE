public static int[] creerTableau(int n){
    int[] tab=new int[n];
    for (int i = 0 ;i < n ;i++){
        tab[i]=i+1;
    }
    return tab;
}

public static int somme (int[] tab){
    int somme =0;
    for (int i = 0 ;i < tab.length; i++){
        somme +=tab[i];
       System.out.println("somme initiale:"+ somme);
}
return somme;
}

public static void incremente(int[] tab){
     for (int i = 0 ;i < tab.length; i++){ 
        tab[i]+= 1;
          System.out.println("somme apres incrementation:"+ somme(tab));  
}
}
