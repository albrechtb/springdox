package com.mangofactory.documentation.plugins;

import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.google.common.base.Optional;
import com.mangofactory.service.model.builder.ModelPropertyBuilder;

import java.lang.reflect.AnnotatedElement;

public class ModelPropertyContext {
  private final ModelPropertyBuilder builder;
  private final Optional<BeanPropertyDefinition> beanPropertyDefinition;
  private final Optional<AnnotatedElement> annotatedElement;
  private final DocumentationType documentationType;

  public ModelPropertyContext(ModelPropertyBuilder builder, AnnotatedElement annotatedElement,
                              DocumentationType documentationType) {
    this.builder = builder;
    this.annotatedElement = Optional.fromNullable(annotatedElement);
    this.beanPropertyDefinition = Optional.absent();
    this.documentationType = documentationType;
  }

  public ModelPropertyContext(ModelPropertyBuilder propertyBuilder, BeanPropertyDefinition beanPropertyDefinition,
                              DocumentationType documentationType) {

    builder = propertyBuilder;
    this.beanPropertyDefinition = Optional.fromNullable(beanPropertyDefinition);
    this.documentationType = documentationType;
    annotatedElement = Optional.absent();
  }

  public ModelPropertyBuilder getBuilder() {
    return builder;
  }

  public DocumentationType getDocumentationType() {
    return documentationType;
  }


  public Optional<AnnotatedElement> getAnnotatedElement() {
    return annotatedElement;
  }

  public Optional<BeanPropertyDefinition> getBeanPropertyDefinition() {
    return beanPropertyDefinition;
  }
}