package org.springframework.social.dropbox.api;

import java.util.List;

/**
 *  API for Dropbox
 * @author Raghava J
 *
 */
public interface Dropbox 
{
	/**
	 * Retrieves user profile details
	 * @return Dropbox User Profile Details
	 */
	DropboxUserProfile getUserProfile();
	
	/**
	 * Returns file/dir metadata
	 * 
	 * @return Metadata
	 */
	Metadata getItemMetadata();
	
	
	/**
	 * Restore file to a revison
	 * Will also retore an deleted file
	 * 
	 * @return Metadata
	 */
	Metadata retore(String path,String rev);
	
	/**
	 * Copy File to new file or dir
	 * 
	 * @param filePath
	 * @param toPath
	 * @return Metadata
	 */
	Metadata copy(String filePath,String toPath);
	
	/**
	 * Created folder at mentioned path
	 * 
	 * @param folder
	 * @return Metadata
	 */
	Metadata createFolder(String folder);
	
	Metadata delete(String path);
	
	Metadata move(String fromPath,String toPath);
	
	List<Metadata> search(String path,String query);
	
	DropboxFile getThumbnail(String path);
	
	DropboxFile getFile(String path);
	
	FileUrl getMedia(String path);
	
	FileUrl getShare(String path);
	
	Metadata putFile(String path,byte[] file);
}
