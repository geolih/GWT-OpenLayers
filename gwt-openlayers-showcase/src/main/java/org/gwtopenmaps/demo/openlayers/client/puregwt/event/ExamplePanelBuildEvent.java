/**
 *
 *   Copyright 2014 sourceforge.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.gwtopenmaps.demo.openlayers.client.puregwt.event;

import com.google.gwt.event.shared.GwtEvent;
import org.gwtopenmaps.demo.openlayers.client.puregwt.handler.ExamplePanelBuildHandler;

/**
 *
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public class ExamplePanelBuildEvent extends GwtEvent<ExamplePanelBuildHandler> {

    private String filter;

    public ExamplePanelBuildEvent() {
    }

    public ExamplePanelBuildEvent(String filter) {
        this.filter = filter;
    }

    @Override
    public Type<ExamplePanelBuildHandler> getAssociatedType() {
        return ExamplePanelBuildHandler.TYPE;
    }

    @Override
    protected void dispatch(ExamplePanelBuildHandler handler) {
        handler.buildExamplePanel(filter);
    }

    /**
     * @param filter the filter to set
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }
}
