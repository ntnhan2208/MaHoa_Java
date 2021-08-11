/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSA;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 *
 * @author ntnng
 */
public class RSAKeyGen {
    private KeyPairGenerator keyGen;
    private KeyPair keyPair;
    private PrivateKey privateKey;
    private PublicKey publicKey;

	
    public RSAKeyGen(int keysize) throws NoSuchAlgorithmException {
            keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(keysize);
		
            keyPair = keyGen.generateKeyPair();
            privateKey = keyPair.getPrivate();
            publicKey = keyPair.getPublic();
	}
    public void writeKeyToFile(String path) throws IOException {
		File fpub = new File(path + "PublicKey");
		File fpri = new File(path + "PrivateKey");
		FileOutputStream fos = new FileOutputStream(fpub);
		fos.write(publicKey.getEncoded());
		fos.flush();
		fos.close();
		fos = new FileOutputStream(fpri);
		fos.write(privateKey.getEncoded());
		fos.flush();
		fos.close();
	}
}
