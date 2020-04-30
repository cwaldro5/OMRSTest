/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openmrs.api.APIException;
import org.openmrs.api.context.Context;
import org.openmrs.test.BaseContextSensitiveTest;
import org.openmrs.util.OpenmrsConstants;


public class FieldAnswerTest extends BaseOpenmrsObject {


     @Before
     public void setup() {
          fieldAnswer = new FieldAnswer();
     }
     
     @Test
     public void shouldReturnClean(){
          FieldAnswer fieldAnswer = new FieldAnswer();
          fieldAnswer.setClean();
          Assert.assertEquals(fieldAnswer.dirty, false);
     }
     
     @Test
     public void shouldSetConcept(){
         FieldAnswer fieldAnswer = new FieldAnswer();
         Concept concept = new Concept();
         fieldAnswer.setConcept(concept);
         Assert.assertTrue(fieldAnswer.dirty);
         Assert.assertEqual(fieldAnswer.concept, concept);
     }
     
     @Test
     public void shouldGetConcept(){
         FieldAnswer fieldAnswer = new FieldAnswer();
         Concept concept = new Concept();
         fieldAnswer.setConcept(concept);
         Assert.assertEqual(fieldAnswer.getConcept(), concept);
     }
     
     @Test
     public void shouldSetCreator(){
          FieldAnswer fieldAnswer = new FieldAnswer();
          User newUser = new User();
          fieldAnswer.setCreator(newUser);
          Assert.assertTrue(fieldAnswer.dirty);
          Assert.assertEqual(fieldAnswer.creator, newUser);
     }
     
     @Test
     public void shouldGetCreator(){
          FieldAnswer fieldAnswer = new FieldAnswer();
          User newUser = new User();
          fieldAnswer.setCreator(newUser);
          Assert.assertEqual(fieldAnswer.getCreator(), newUser);
     }
      
     @Test
     public void shouldSetDate(){
          FieldAnswer fieldAnswer = new FieldAnswer();
          Date date = new Date();
          fieldAnswer.setDateCreated(date);
          Assert.assertEquals(fieldAnswer.dirty, true);
          Assert.assertEquals(fieldAnswer.dateCreated, date);
     }
     
     @Test
     public void shouldGetDate(){
          FieldAnswer fieldAnswer = new FieldAnswer();
          Date date = new Date();
          fieldAnswer.setDateCreated(date);
          Assert.assertEquals(getDateCreated(), date);
     }
     
     @Test
     public void shouldSetField(){
          FieldAnswer fieldAnswer = new FieldAnswer();
          Field newField = new Field();
          fieldAnswer.setField(newField);
          Assert.assertTrue(fieldAnswer.dirty);
          Assert.assertEqual(fieldAnser.field, newField);
     }
     
     @Test
     public void shouldGetField(){
          FieldAnswer fieldAnswer = FieldAnswer();
          Field newField = Field();
          fieldAnswer.setField(newField);
          Assert.assertEqual(fieldAnswer.getField(), newField);
     }
     
     @Test(expected = UnsupportedOperationException.class)
     public void shouldThrowErrorWhenSettingId(){
          FieldAnswer fieldAnswer = new FieldAnswer();
          fieldAnswer.setId();
     }
     
     @Test(expected = UnsupportedOperationException.class)
     public void shouldThrowErrorWhenGettingId(){
          FieldAnswer fieldAnswer = new FieldAnswer();
          fieldAnswer.getId();
     }
}