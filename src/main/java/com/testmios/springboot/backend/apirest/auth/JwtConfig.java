package com.testmios.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEAoMVJPZkM+Ocn11rdtSokyQ41uVbBYuoSv0q2Rfj2KQyxRMuF\r\n" + 
			"ecobIdJOqteNX4QGMmA7Y3M9ypB6Uz2bT4qqPw7JXlxy6Uc1fH8Ok34FlWfTJsws\r\n" + 
			"bzf+Z8/1xpkm6+mr4Vy+z9On7NIYbOciosP/qSnUxQ5uE23X3v9xJETvxM9B6Nhc\r\n" + 
			"f8eNfObA6rJ+EqtXo+1sNKj01DhpxF6UCz2kTnOEZXI+Kk37doFywlnqpTg5ftL+\r\n" + 
			"aiUDCZIa21UUL6C5h2h4g5lmmNesS0h2PeQkAVGeRMb2MKlo2Q7UiPI7z7fMm95i\r\n" + 
			"n/UFyRMr/mvtcj61qmsoMcP5yo/rqVB9fNIa5QIDAQABAoIBAQCGUExACf2sdHH0\r\n" + 
			"mRVgpTTWQ+jeTnyCBsxixChDjRsacGAo+V8pwI+qUeknEa4qfkIvE/aJv12APfP0\r\n" + 
			"VyPJ8C8LP288RkA6ZCNrPzsOPdqsV3EwmKMGx+DjGfpbUNgTf8T5ImLHfixszZla\r\n" + 
			"Yj+te9G7ohcACm4sDTisNPxxMKaf5LRQR8S7TJx6FrM73AZqDZgmZgdG+B+po8y2\r\n" + 
			"BgHztdG1kdSO+Of0YTRGRc/Rkcyhb0lnPyr7liTICbjgiBqsBlBfHb76FuZrj9kb\r\n" + 
			"7o52QE6iPdsDPozFuv/nwACWDYlRPqdwpkde72wT2zBP0vx+PclKpEJKirMAva7L\r\n" + 
			"hI4ZY6aBAoGBAMusLJm43VA62EvO1y58oDZFWDP+lj3JBDmxezcv07Ig2WpmbvfC\r\n" + 
			"LP1eLYHs0YJ6xCbbPZa9JNvBceHjHLiYvfaqzVev0pd+8weSm/bR6ivbbm++Bvcf\r\n" + 
			"ziRIn+/WCjTjaflvP54ypMaIbPbwpNaVShU1lTfeMhwQxoVPOsMrKsiPAoGBAMoT\r\n" + 
			"ZORtXHAY+Iz2FMEejZa6Tvvagiam8TP+Jy2bQ+rLIqhH9uYjj18p3HDMspux4PIQ\r\n" + 
			"6nQeaEmNoaPAG6cz+3cg6pXeTB49GXAAAbuL7RRDwMguWsc8zvj+QThiC6O7Cq3/\r\n" + 
			"OJ0zwLW8gC8qyd/fOgPqExKrfFURr3FhebQxs5dLAoGAGB9SQPqmK6Rsjb33umfE\r\n" + 
			"Sek4ox/aB4NRXsvofgbKGeTOG036gpma3n9TAHpd7ghARyHcT4gjX2uv40MU2cAt\r\n" + 
			"b5OXMnV+ibbdbd4tXrRJ+dvJXq6xAH/h2GZJmwxMtSriGErWzBPPdDwgO7cQruGL\r\n" + 
			"nqtz+uP0J2LNQGi72vW34X0CgYBf8INHPHDVu9VNv4utAJ+Cf2P+iQif50S/RZw+\r\n" + 
			"N+gv8k+7C6e6LgnkyZAicd0etH4zDzrw9HrY6QhkIVI/uRtbvOIDU25aMPIBzc8E\r\n" + 
			"xvNBWsWNhQyOaV1us/AtH8ec7bGtWG39nNOStTM6sZr00hvOPfTeOVKnZOUh9IB+\r\n" + 
			"v9YfLwKBgHI+iLykwZgeM/R44Nwr5HNHlO02bH/T1/ep3akSklxE5hZ2+DQLkQqk\r\n" + 
			"xqkSLDy1eGbTHjoytQUGRppAUJSedRy5Otb/LF1qMMge1lU8/G/PYi6D6esTOqAa\r\n" + 
			"WL+okVCNWNcDN7fOMFkdG8K1XUqXQIZ3SeqMnayC/KbvX0OlZECg\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoMVJPZkM+Ocn11rdtSok\r\n" + 
			"yQ41uVbBYuoSv0q2Rfj2KQyxRMuFecobIdJOqteNX4QGMmA7Y3M9ypB6Uz2bT4qq\r\n" + 
			"Pw7JXlxy6Uc1fH8Ok34FlWfTJswsbzf+Z8/1xpkm6+mr4Vy+z9On7NIYbOciosP/\r\n" + 
			"qSnUxQ5uE23X3v9xJETvxM9B6Nhcf8eNfObA6rJ+EqtXo+1sNKj01DhpxF6UCz2k\r\n" + 
			"TnOEZXI+Kk37doFywlnqpTg5ftL+aiUDCZIa21UUL6C5h2h4g5lmmNesS0h2PeQk\r\n" + 
			"AVGeRMb2MKlo2Q7UiPI7z7fMm95in/UFyRMr/mvtcj61qmsoMcP5yo/rqVB9fNIa\r\n" + 
			"5QIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
