package org.drools.workbench.screens.globals.client.editor;

import java.util.List;

import org.kie.workbench.common.widgets.client.widget.HasBusyIndicator;
import org.drools.workbench.models.commons.shared.oracle.PackageDataModelOracle;
import org.drools.workbench.screens.globals.model.Global;
import org.uberfire.client.mvp.UberView;

/**
 * Globals Editor View definition
 */
public interface GlobalsEditorView extends HasBusyIndicator,
                                           UberView<GlobalsEditorPresenter> {

    void setContent( final PackageDataModelOracle oracle,
                     final List<Global> globals,
                     final boolean isReadOnly );

    boolean isDirty();

    void setNotDirty();

    boolean confirmClose();

    void alertReadOnly();

}
