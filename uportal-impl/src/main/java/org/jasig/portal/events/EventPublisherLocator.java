/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portal.events;

import org.jasig.portal.spring.PortalApplicationContextLocator;
import org.springframework.context.ApplicationEventPublisher;

/**
 * Simple wrapper to provide access to a {@link ApplicationEventPublisher} for classes that
 * publish events.
 * 
 * @version $Revision$
 * @deprecated Use Spring managed beans and {@link org.springframework.context.ApplicationEventPublisherAware}
 */
@Deprecated
public final class EventPublisherLocator {

	/**
	 * @return The ApplicationEventPublisher to use for publishing events.
	 */
	public static final ApplicationEventPublisher getApplicationEventPublisher() {
	    return PortalApplicationContextLocator.getApplicationContext();
	}
}