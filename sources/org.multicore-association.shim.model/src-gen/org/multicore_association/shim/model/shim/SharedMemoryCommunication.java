/**
 */
package org.multicore_association.shim.model.shim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Memory Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSizeUnit <em>Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getAddressSpaceRef <em>Address Space Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getSubSpaceRef <em>Sub Space Ref</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getSharedMemoryCommunication()
 * @model extendedMetaData="name='SharedMemoryCommunication' kind='elementOnly'"
 * @generated
 */
public interface SharedMemoryCommunication extends AbstractCommunication {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.OperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.OperationType
	 * @see #isSetOperationType()
	 * @see #unsetOperationType()
	 * @see #setOperationType(OperationType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSharedMemoryCommunication_OperationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='operationType' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationType getOperationType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.OperationType
	 * @see #isSetOperationType()
	 * @see #unsetOperationType()
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(OperationType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperationType()
	 * @see #getOperationType()
	 * @see #setOperationType(OperationType)
	 * @generated
	 */
	void unsetOperationType();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getOperationType <em>Operation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation Type</em>' attribute is set.
	 * @see #unsetOperationType()
	 * @see #getOperationType()
	 * @see #setOperationType(OperationType)
	 * @generated
	 */
	boolean isSetOperationType();

	/**
	 * Returns the value of the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size</em>' attribute.
	 * @see #isSetDataSize()
	 * @see #unsetDataSize()
	 * @see #setDataSize(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSharedMemoryCommunication_DataSize()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='dataSize' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getDataSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSize <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size</em>' attribute.
	 * @see #isSetDataSize()
	 * @see #unsetDataSize()
	 * @see #getDataSize()
	 * @generated
	 */
	void setDataSize(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSize <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSize()
	 * @see #getDataSize()
	 * @see #setDataSize(Integer)
	 * @generated
	 */
	void unsetDataSize();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSize <em>Data Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Size</em>' attribute is set.
	 * @see #unsetDataSize()
	 * @see #getDataSize()
	 * @see #setDataSize(Integer)
	 * @generated
	 */
	boolean isSetDataSize();

	/**
	 * Returns the value of the '<em><b>Data Size Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.SizeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #isSetDataSizeUnit()
	 * @see #unsetDataSizeUnit()
	 * @see #setDataSizeUnit(SizeUnitType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSharedMemoryCommunication_DataSizeUnit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dataSizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getDataSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #isSetDataSizeUnit()
	 * @see #unsetDataSizeUnit()
	 * @see #getDataSizeUnit()
	 * @generated
	 */
	void setDataSizeUnit(SizeUnitType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSizeUnit()
	 * @see #getDataSizeUnit()
	 * @see #setDataSizeUnit(SizeUnitType)
	 * @generated
	 */
	void unsetDataSizeUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Size Unit</em>' attribute is set.
	 * @see #unsetDataSizeUnit()
	 * @see #getDataSizeUnit()
	 * @see #setDataSizeUnit(SizeUnitType)
	 * @generated
	 */
	boolean isSetDataSizeUnit();

	/**
	 * Returns the value of the '<em><b>Address Space Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Space Ref</em>' reference.
	 * @see #setAddressSpaceRef(AddressSpace)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSharedMemoryCommunication_AddressSpaceRef()
	 * @model extendedMetaData="kind='attribute' name='addressSpaceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressSpace getAddressSpaceRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getAddressSpaceRef <em>Address Space Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Space Ref</em>' reference.
	 * @see #getAddressSpaceRef()
	 * @generated
	 */
	void setAddressSpaceRef(AddressSpace value);

	/**
	 * Returns the value of the '<em><b>Sub Space Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Space Ref</em>' reference.
	 * @see #setSubSpaceRef(SubSpace)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSharedMemoryCommunication_SubSpaceRef()
	 * @model extendedMetaData="kind='attribute' name='subSpaceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	SubSpace getSubSpaceRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getSubSpaceRef <em>Sub Space Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Space Ref</em>' reference.
	 * @see #getSubSpaceRef()
	 * @generated
	 */
	void setSubSpaceRef(SubSpace value);

} // SharedMemoryCommunication
