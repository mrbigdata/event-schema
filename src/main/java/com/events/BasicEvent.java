package com.events;

import com.events.BasicEvent.Builder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import org.inferred.freebuilder.FreeBuilder;
import org.joda.time.DateTime;

@FreeBuilder
@JsonDeserialize(builder= Builder.class)
public interface BasicEvent {
  /** Unique ID of this event. */
  String eventId();

  String eventType();

  DateTime createdAt();

  class Builder extends BasicEvent_Builder {}
}
