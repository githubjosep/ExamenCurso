package com.examen.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.examen.model.ModelTO;
import lombok.extern.log4j.Log4j;

@Log4j
public class FileUtil {

	public static synchronized ArrayList<ModelTO> devuelveRegistrosFichero(String sfile) throws IOException {
		BufferedReader br = null;
		ModelTO myObj = null;
		ArrayList<ModelTO> listaModel = new ArrayList<ModelTO>();

		try {
			br = new BufferedReader(new FileReader(sfile));
			String line = br.readLine();
			while (null != line) {
				String[] datos = line.split(";", 3);

				if (!datos[0].equals("Fecha")) {
					myObj = new ModelTO(datos[0], datos[1], datos[2]);

					listaModel.add(myObj);
				}	

				line = br.readLine();
			}

		} catch (IOException e) {
			log.error("Error al leer del fichero");
			throw e;

		} finally {
			if (null != br)
				br.close();
		}

		return listaModel;
	}
}
