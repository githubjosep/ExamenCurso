package com.examen.principal;

import java.io.IOException;
import java.util.ArrayList;

import com.examen.dao.ExamenDao;
import com.examen.model.ModelTO;

public class Main {
	public static void main(String[] args) {
		ExamenDao mObj = new ExamenDao();
		

		try {
			ArrayList<ModelTO> myLst = null;
			
			myLst = mObj.CalculaValores();
			
			
			
			
		} catch (IOException e) {
			System.out.println("Error al realziar el calculo.");
		}

	}
}
