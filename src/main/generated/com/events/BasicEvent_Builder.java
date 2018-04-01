// Autogenerated code. Do not modify.
package com.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.EnumSet;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Generated;
import org.joda.time.DateTime;

/**
 * Auto-generated superclass of {@link BasicEvent.Builder}, derived from the API of {@link
 * BasicEvent}.
 */
@Generated("org.inferred.freebuilder.processor.CodeGenerator")
abstract class BasicEvent_Builder {

  /** Creates a new builder using {@code value} as a template. */
  public static BasicEvent.Builder from(BasicEvent value) {
    return new BasicEvent.Builder().mergeFrom(value);
  }

  private static final Joiner COMMA_JOINER = Joiner.on(", ").skipNulls();

  private enum Property {
    EVENT_ID("eventId"),
    EVENT_TYPE("eventType"),
    CREATED_AT("createdAt"),
    ;

    private final String name;

    private Property(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return name;
    }
  }

  private String eventId;
  private String eventType;
  private DateTime createdAt;
  private final EnumSet<BasicEvent_Builder.Property> _unsetProperties =
      EnumSet.allOf(BasicEvent_Builder.Property.class);

  /**
   * Sets the value to be returned by {@link BasicEvent#eventId()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code eventId} is null
   */
  @JsonProperty("eventId")
  public BasicEvent.Builder eventId(String eventId) {
    this.eventId = Preconditions.checkNotNull(eventId);
    _unsetProperties.remove(BasicEvent_Builder.Property.EVENT_ID);
    return (BasicEvent.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link BasicEvent#eventId()} by applying {@code mapper} to
   * it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public BasicEvent.Builder mapEventId(UnaryOperator<String> mapper) {
    Preconditions.checkNotNull(mapper);
    return eventId(mapper.apply(eventId()));
  }

  /**
   * Returns the value that will be returned by {@link BasicEvent#eventId()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public String eventId() {
    Preconditions.checkState(
        !_unsetProperties.contains(BasicEvent_Builder.Property.EVENT_ID), "eventId not set");
    return eventId;
  }

  /**
   * Sets the value to be returned by {@link BasicEvent#eventType()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code eventType} is null
   */
  @JsonProperty("eventType")
  public BasicEvent.Builder eventType(String eventType) {
    this.eventType = Preconditions.checkNotNull(eventType);
    _unsetProperties.remove(BasicEvent_Builder.Property.EVENT_TYPE);
    return (BasicEvent.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link BasicEvent#eventType()} by applying {@code mapper}
   * to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public BasicEvent.Builder mapEventType(UnaryOperator<String> mapper) {
    Preconditions.checkNotNull(mapper);
    return eventType(mapper.apply(eventType()));
  }

  /**
   * Returns the value that will be returned by {@link BasicEvent#eventType()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public String eventType() {
    Preconditions.checkState(
        !_unsetProperties.contains(BasicEvent_Builder.Property.EVENT_TYPE), "eventType not set");
    return eventType;
  }

  /**
   * Sets the value to be returned by {@link BasicEvent#createdAt()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code createdAt} is null
   */
  @JsonProperty("createdAt")
  public BasicEvent.Builder createdAt(DateTime createdAt) {
    this.createdAt = Preconditions.checkNotNull(createdAt);
    _unsetProperties.remove(BasicEvent_Builder.Property.CREATED_AT);
    return (BasicEvent.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link BasicEvent#createdAt()} by applying {@code mapper}
   * to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public BasicEvent.Builder mapCreatedAt(UnaryOperator<DateTime> mapper) {
    Preconditions.checkNotNull(mapper);
    return createdAt(mapper.apply(createdAt()));
  }

  /**
   * Returns the value that will be returned by {@link BasicEvent#createdAt()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public DateTime createdAt() {
    Preconditions.checkState(
        !_unsetProperties.contains(BasicEvent_Builder.Property.CREATED_AT), "createdAt not set");
    return createdAt;
  }

  /** Sets all property values using the given {@code BasicEvent} as a template. */
  public BasicEvent.Builder mergeFrom(BasicEvent value) {
    BasicEvent_Builder _defaults = new BasicEvent.Builder();
    if (_defaults._unsetProperties.contains(BasicEvent_Builder.Property.EVENT_ID)
        || !value.eventId().equals(_defaults.eventId())) {
      eventId(value.eventId());
    }
    if (_defaults._unsetProperties.contains(BasicEvent_Builder.Property.EVENT_TYPE)
        || !value.eventType().equals(_defaults.eventType())) {
      eventType(value.eventType());
    }
    if (_defaults._unsetProperties.contains(BasicEvent_Builder.Property.CREATED_AT)
        || !value.createdAt().equals(_defaults.createdAt())) {
      createdAt(value.createdAt());
    }
    return (BasicEvent.Builder) this;
  }

  /**
   * Copies values from the given {@code Builder}. Does not affect any properties not set on the
   * input.
   */
  public BasicEvent.Builder mergeFrom(BasicEvent.Builder template) {
    // Upcast to access private fields; otherwise, oddly, we get an access violation.
    BasicEvent_Builder base = (BasicEvent_Builder) template;
    BasicEvent_Builder _defaults = new BasicEvent.Builder();
    if (!base._unsetProperties.contains(BasicEvent_Builder.Property.EVENT_ID)
        && (_defaults._unsetProperties.contains(BasicEvent_Builder.Property.EVENT_ID)
            || !template.eventId().equals(_defaults.eventId()))) {
      eventId(template.eventId());
    }
    if (!base._unsetProperties.contains(BasicEvent_Builder.Property.EVENT_TYPE)
        && (_defaults._unsetProperties.contains(BasicEvent_Builder.Property.EVENT_TYPE)
            || !template.eventType().equals(_defaults.eventType()))) {
      eventType(template.eventType());
    }
    if (!base._unsetProperties.contains(BasicEvent_Builder.Property.CREATED_AT)
        && (_defaults._unsetProperties.contains(BasicEvent_Builder.Property.CREATED_AT)
            || !template.createdAt().equals(_defaults.createdAt()))) {
      createdAt(template.createdAt());
    }
    return (BasicEvent.Builder) this;
  }

  /** Resets the state of this builder. */
  public BasicEvent.Builder clear() {
    BasicEvent_Builder _defaults = new BasicEvent.Builder();
    eventId = _defaults.eventId;
    eventType = _defaults.eventType;
    createdAt = _defaults.createdAt;
    _unsetProperties.clear();
    _unsetProperties.addAll(_defaults._unsetProperties);
    return (BasicEvent.Builder) this;
  }

  /**
   * Returns a newly-created {@link BasicEvent} based on the contents of the {@code Builder}.
   *
   * @throws IllegalStateException if any field has not been set
   */
  public BasicEvent build() {
    Preconditions.checkState(_unsetProperties.isEmpty(), "Not set: %s", _unsetProperties);
    return new BasicEvent_Builder.Value(this);
  }

  /**
   * Returns a newly-created partial {@link BasicEvent} for use in unit tests. State checking will
   * not be performed. Unset properties will throw an {@link UnsupportedOperationException} when
   * accessed via the partial object.
   *
   * <p>Partials should only ever be used in tests. They permit writing robust test cases that won't
   * fail if this type gains more application-level constraints (e.g. new required fields) in
   * future. If you require partially complete values in production code, consider using a Builder.
   */
  @VisibleForTesting()
  public BasicEvent buildPartial() {
    return new BasicEvent_Builder.Partial(this);
  }

  private static final class Value implements BasicEvent {
    private final String eventId;
    private final String eventType;
    private final DateTime createdAt;

    private Value(BasicEvent_Builder builder) {
      this.eventId = builder.eventId;
      this.eventType = builder.eventType;
      this.createdAt = builder.createdAt;
    }

    @Override
    @JsonProperty("eventId")
    public String eventId() {
      return eventId;
    }

    @Override
    @JsonProperty("eventType")
    public String eventType() {
      return eventType;
    }

    @Override
    @JsonProperty("createdAt")
    public DateTime createdAt() {
      return createdAt;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof BasicEvent_Builder.Value)) {
        return false;
      }
      BasicEvent_Builder.Value other = (BasicEvent_Builder.Value) obj;
      return Objects.equals(eventId, other.eventId)
          && Objects.equals(eventType, other.eventType)
          && Objects.equals(createdAt, other.createdAt);
    }

    @Override
    public int hashCode() {
      return Objects.hash(eventId, eventType, createdAt);
    }

    @Override
    public String toString() {
      return "BasicEvent{"
          + "eventId="
          + eventId
          + ", "
          + "eventType="
          + eventType
          + ", "
          + "createdAt="
          + createdAt
          + "}";
    }
  }

  private static final class Partial implements BasicEvent {
    private final String eventId;
    private final String eventType;
    private final DateTime createdAt;
    private final EnumSet<BasicEvent_Builder.Property> _unsetProperties;

    Partial(BasicEvent_Builder builder) {
      this.eventId = builder.eventId;
      this.eventType = builder.eventType;
      this.createdAt = builder.createdAt;
      this._unsetProperties = builder._unsetProperties.clone();
    }

    @Override
    @JsonProperty("eventId")
    public String eventId() {
      if (_unsetProperties.contains(BasicEvent_Builder.Property.EVENT_ID)) {
        throw new UnsupportedOperationException("eventId not set");
      }
      return eventId;
    }

    @Override
    @JsonProperty("eventType")
    public String eventType() {
      if (_unsetProperties.contains(BasicEvent_Builder.Property.EVENT_TYPE)) {
        throw new UnsupportedOperationException("eventType not set");
      }
      return eventType;
    }

    @Override
    @JsonProperty("createdAt")
    public DateTime createdAt() {
      if (_unsetProperties.contains(BasicEvent_Builder.Property.CREATED_AT)) {
        throw new UnsupportedOperationException("createdAt not set");
      }
      return createdAt;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof BasicEvent_Builder.Partial)) {
        return false;
      }
      BasicEvent_Builder.Partial other = (BasicEvent_Builder.Partial) obj;
      return Objects.equals(eventId, other.eventId)
          && Objects.equals(eventType, other.eventType)
          && Objects.equals(createdAt, other.createdAt)
          && Objects.equals(_unsetProperties, other._unsetProperties);
    }

    @Override
    public int hashCode() {
      return Objects.hash(eventId, eventType, createdAt, _unsetProperties);
    }

    @Override
    public String toString() {
      return "partial BasicEvent{"
          + COMMA_JOINER.join(
              (!_unsetProperties.contains(BasicEvent_Builder.Property.EVENT_ID)
                  ? "eventId=" + eventId
                  : null),
              (!_unsetProperties.contains(BasicEvent_Builder.Property.EVENT_TYPE)
                  ? "eventType=" + eventType
                  : null),
              (!_unsetProperties.contains(BasicEvent_Builder.Property.CREATED_AT)
                  ? "createdAt=" + createdAt
                  : null))
          + "}";
    }
  }
}
