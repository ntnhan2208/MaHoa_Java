
package RSA;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSA {

	public static String encryptText(String msg, PrivateKey key) throws IllegalBlockSizeException, BadPaddingException,
			UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		return Base64.getEncoder().encodeToString(cipher.doFinal(msg.getBytes("UTF-8")));
	}

	
	public static String decryptText(String msg, PublicKey key) throws UnsupportedEncodingException, IllegalBlockSizeException,
			BadPaddingException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, key);
		String decrypted = new String(cipher.doFinal(Base64.getDecoder().decode(msg)), "UTF-8");
		return decrypted;
	}
        
        public PublicKey readPublicKeyFromFile(String path)
			throws IOException, InvalidKeySpecException, NoSuchAlgorithmException {
		File f = new File(path);
		byte[] encodedpublic = Files.readAllBytes(f.toPath());
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(encodedpublic);
		KeyFactory kf = KeyFactory.getInstance("RSA");
                PublicKey publicKey = kf.generatePublic(keySpec);
		return publicKey;
	}
    
        public PrivateKey readPrivateKeyFromFile(String path)
			throws IOException, InvalidKeySpecException, NoSuchAlgorithmException {
		File f = new File(path);
		byte[] encodedprivate = Files.readAllBytes(f.toPath());
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encodedprivate);
                
		KeyFactory kf = KeyFactory.getInstance("RSA");
                PrivateKey privateKey = kf.generatePrivate(keySpec);
		return privateKey;
	}
}
