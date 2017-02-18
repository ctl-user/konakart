package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - GetManufacturerPerProduct - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetManufacturerPerProduct
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetManufacturerPerProduct(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public ManufacturerIf getManufacturerPerProduct(int productId, int languageId) throws KKException
     {
         return kkEng.getManufacturerPerProduct(productId, languageId);
     }
}
