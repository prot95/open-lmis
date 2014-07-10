/*
 * This program is part of the OpenLMIS logistics management information system platform software.
 * Copyright © 2013 VillageReach
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *  
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License along with this program.  If not, see http://www.gnu.org/licenses.  For additional information contact info@OpenLMIS.org. 
 */

package org.openlmis.core.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.openlmis.core.domain.ProductGroup;
import org.openlmis.core.repository.ProductGroupRepository;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ProductGroupServiceTest {

  @Mock
  private ProductGroupRepository productGroupRepository;

  @InjectMocks
  private ProductGroupService service;
  private ProductGroup productGroup;

  @Before
  public void setup() {
    productGroup = new ProductGroup();
  }

  @Test
  public void shouldSaveProductGroup() throws Exception {
    service.save(productGroup);

    verify(productGroupRepository).insert(productGroup);
  }

  @Test
  public void shouldUpdateProductGroup() throws Exception {
    productGroup.setId(1L);

    service.save(productGroup);

    verify(productGroupRepository).update(productGroup);
  }

  @Test
  public void shouldGetAll() {
    service.getAll();

    verify(productGroupRepository).getAll();
  }
}
