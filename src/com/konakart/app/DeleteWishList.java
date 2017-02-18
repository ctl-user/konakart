package com.konakart.app;

/**
 *  The KonaKart Custom Engine - DeleteWishList - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class DeleteWishList
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public DeleteWishList(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public void deleteWishList(String sessionId, int wishListId) throws KKException
     {
         kkEng.deleteWishList(sessionId, wishListId);
     }
}