package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - GetCustomerTagForGuest - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetCustomerTagForGuest
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetCustomerTagForGuest(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public CustomerTagIf getCustomerTagForGuest(int customerId, String tagName) throws KKException
     {
         return kkEng.getCustomerTagForGuest(customerId, tagName);
     }
}
