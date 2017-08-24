/**
 * 
 */
package com.aequalis.service;

import com.aequalis.model.Vendor;
import com.aequalis.model.VendorQRCode;

/**
 * @author anand
 *
 */
public interface VendorQRCodeService {
	public void addVendorQRCode(VendorQRCode qrCode);
	public VendorQRCode findByVendor(Vendor vendor);
}
