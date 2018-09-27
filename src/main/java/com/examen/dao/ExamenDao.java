package com.examen.dao;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.examen.model.ModelTO;
import com.examen.util.FileUtil;

public class ExamenDao {
	/* static final Logger logger = lLogger.getLogger(StudentDao.class); */
	static Properties prop = null;

	static final Logger logger = Logger.getLogger(ExamenDao.class);
	// static FileInputStream input = null;
	static FileInputStream input = null;

	static String sFilename;
	static {
		prop = new Properties();
		try {
			input = new FileInputStream("config.properties");
			// input = ExamenDao.class.getResourceAsStream("/config.properties");
			prop.load(input);
			sFilename = prop.getProperty("filename");
		} catch (IOException e) {
			/* logger.error(e.getMessage()); */
			throw new ExceptionInInitializerError(e);
		}
	}

	public ArrayList<ModelTO> CalculaValores() throws IOException {

		return FileUtil.devuelveRegistrosFichero(sFilename);

	}
}
