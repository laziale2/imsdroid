/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class SMSData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SMSData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SMSData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_SMSData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SMSData() {
    this(tinyWRAPJNI.new_SMSData(), true);
  }

  public twrap_sms_type_t getType() {
    return twrap_sms_type_t.swigToEnum(tinyWRAPJNI.SMSData_getType(swigCPtr, this));
  }

  public int getMR() {
    return tinyWRAPJNI.SMSData_getMR(swigCPtr, this);
  }

  public long getPayloadLength() {
    return tinyWRAPJNI.SMSData_getPayloadLength(swigCPtr, this);
  }

  public long getPayload(java.nio.ByteBuffer output, long maxsize) {
    return tinyWRAPJNI.SMSData_getPayload(swigCPtr, this, output, maxsize);
  }

  public String getOA() {
    return tinyWRAPJNI.SMSData_getOA(swigCPtr, this);
  }

  public String getDA() {
    return tinyWRAPJNI.SMSData_getDA(swigCPtr, this);
  }

}
