public class Pessoa	{
  @Column(columnDefinition = "text") // Tipo text grava arquivos em base 64
	private String fotoIconBase64;
	
	private String extensao; // Extensão jpg, png, jpeg
	
	@Lob // Gravar arquivos no banco de dados
	@Basic (fetch = FetchType.LAZY)
	private byte[] fotoIconBase64Original;;
}

@ManagedBean(name = "pessoaBean")
public class PessoaBean{
  private Part arquivoFoto;

  
  // Metódo que converte inputStream para array de bytes
	private byte[] getByte (InputStream is) throws IOException {
		int len;
		int size = 1024;
		byte[] buf = null;
		if(is instanceof ByteArrayInputStream ) {
			size = is.available();
			buf = new byte[size];
			len = is.read(buf,0,size);
		}else {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			buf = new byte[size];
			
			while((len = is.read(buf, 0 , size)) != -1) {
				bos.write(buf,0,len);
			}
			
			buf = bos.toByteArray();
		}
		
		return buf;
	}
	
  // Processar imagem
		byte[] imagemByte = getByte(arquivoFoto.getInputStream());
		// Salva imagem original
		pessoa.setFotoIconBase64Original(imagemByte);
		// Transformar em bufferimage
		BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(imagemByte));
		// Pega o tipo da imagem
		int type = bufferedImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : bufferedImage.getType();
		
		int largura = 200;
		int altura = 200;
		//Criar a miniatura
		BufferedImage resizedImage = new BufferedImage(largura, altura, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(bufferedImage,0, 0, largura, altura, null);
		g.dispose();
		// Escrever novamente a imagem em tamanho menor
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		// Image/png/
		String extensao = arquivoFoto.getContentType().split("\\/")[1];
		ImageIO.write(resizedImage, extensao, baos);
		
		String miniImagem = "data:" + arquivoFoto.getContentType() + ";base64," +
							DatatypeConverter.printBase64Binary(baos.toByteArray());
		//Processar imagem
		pessoa.setFotoIconBase64(miniImagem);
		pessoa.setExtensao(extensao);
    }
