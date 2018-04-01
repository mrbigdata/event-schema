package com.events;

import com.events.BasicEvent.Builder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.inferred.freebuilder.FreeBuilder;
import org.joda.time.DateTime;

@FreeBuilder
@JsonDeserialize(builder = Builder.class)
public interface BasicEvent {
  /** Unique ID of this event. */
  String eventId();

  String eventType();

  DateTime createdAt();

  class Builder extends BasicEvent_Builder {}
}
