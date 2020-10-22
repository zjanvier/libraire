import java.util.Scanner;

/*
* Author : jzagabe
* Date : Oct. 22, 2020
* 
* Description :Programme permettant de générer la facture
* des achats en tenant compte des taxes imposées et de la
* remise offerte selon le montant des achats pour les livres
*/

public class Facture
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		// Déclaration des variables
		String nom,prenom, facture;
		double mLivres,mFruits,mTaxe,mRemise,mTotal,mAPayer=0.0;
		
		//Récupération des données du client
		System.out.println("Donner le nom ");
		nom=sc.nextLine();
		System.out.println("Donner le prénom ");
		prenom=sc.nextLine();
		System.out.println("Donner le montant d'achat des livres ");
		mLivres=sc.nextDouble();
		System.out.println("Donner le montant d'achat des fruits ");
		mFruits=sc.nextDouble();
		
		//Calcul de la taxe 
		mTaxe=mLivres*0.15;
		
		//Calcul de la remise
		if(mLivres>=200)
			mRemise=mLivres*0.1;
		else
			if(mLivres>=100)
				mRemise=mLivres*0.05;
			else
				if(mLivres>=50)
					mRemise=mLivres*0.02;
				else
					mRemise=0.0;
		//Calcul du montant Total et le montant à payer
		mTotal=mLivres+mTaxe+mFruits;
		mAPayer=mTotal-mRemise;
		
		//Affichage de la facture
		
		facture="Facture pour : "+prenom + " " + nom + "\n \n";
		facture=facture + "Voici les détails de vos achats"+ "\n";
		facture=facture + "Livres: \t"+  mLivres+ " $" + "\n";
		if(mFruits>0)
		facture=facture + "Fruits: \t"+ mFruits+" $" + "\n";
		facture=facture + "Taxes : \t"+ String.format("%.2f", mTaxe) +" $" + "\n";
		facture=facture + "Total : \t"+ mTotal+" $" + "\n";
		facture=facture + "Remise: \t"+ mRemise+" $" + "\n";
		facture=facture + "À payer: \t"+ mAPayer+" $" + "\n";
		
		System.out.println(facture);
		

		
		sc.close();
		
	}

}

