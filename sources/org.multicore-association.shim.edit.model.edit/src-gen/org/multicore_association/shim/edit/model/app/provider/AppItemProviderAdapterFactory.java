/**
 */
package org.multicore_association.shim.edit.model.app.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.multicore_association.shim.edit.model.app.util.AppAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AppItemProviderAdapterFactory extends AppAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessTypeWizardPageDataItemProvider accessTypeWizardPageDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAccessTypeWizardPageDataAdapter() {
		if (accessTypeWizardPageDataItemProvider == null) {
			accessTypeWizardPageDataItemProvider = new AccessTypeWizardPageDataItemProvider(this);
		}

		return accessTypeWizardPageDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressSpaceParameterWizardPageDataItemProvider addressSpaceParameterWizardPageDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressSpaceParameterWizardPageDataAdapter() {
		if (addressSpaceParameterWizardPageDataItemProvider == null) {
			addressSpaceParameterWizardPageDataItemProvider = new AddressSpaceParameterWizardPageDataItemProvider(this);
		}

		return addressSpaceParameterWizardPageDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.multicore_association.shim.edit.model.app.CacheWizardPageData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheWizardPageDataItemProvider cacheWizardPageDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.multicore_association.shim.edit.model.app.CacheWizardPageData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCacheWizardPageDataAdapter() {
		if (cacheWizardPageDataItemProvider == null) {
			cacheWizardPageDataItemProvider = new CacheWizardPageDataItemProvider(this);
		}

		return cacheWizardPageDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationSetWizardPageDataItemProvider communicationSetWizardPageDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationSetWizardPageDataAdapter() {
		if (communicationSetWizardPageDataItemProvider == null) {
			communicationSetWizardPageDataItemProvider = new CommunicationSetWizardPageDataItemProvider(this);
		}

		return communicationSetWizardPageDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentParameterWizardPageDataItemProvider componentParameterWizardPageDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentParameterWizardPageDataAdapter() {
		if (componentParameterWizardPageDataItemProvider == null) {
			componentParameterWizardPageDataItemProvider = new ComponentParameterWizardPageDataItemProvider(this);
		}

		return componentParameterWizardPageDataItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

}
