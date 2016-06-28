package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Calibration;
import io.swagger.client.model.Conversation;
import io.swagger.client.model.EvaluationForm;
import io.swagger.client.model.EvaluationScoringSet;
import io.swagger.client.model.Queue;
import io.swagger.client.model.User;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class Evaluation   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("conversation")
  private Conversation conversation = null;

  @SerializedName("evaluationForm")
  private EvaluationForm evaluationForm = null;

  @SerializedName("evaluator")
  private User evaluator = null;

  @SerializedName("agent")
  private User agent = null;

  @SerializedName("calibration")
  private Calibration calibration = null;


  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("PENDING")
    PENDING("PENDING"),

    @SerializedName("INPROGRESS")
    INPROGRESS("INPROGRESS"),

    @SerializedName("FINISHED")
    FINISHED("FINISHED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("answers")
  private EvaluationScoringSet answers = null;

  @SerializedName("agentHasRead")
  private Boolean agentHasRead = false;

  @SerializedName("releaseDate")
  private Date releaseDate = null;

  @SerializedName("assignedDate")
  private Date assignedDate = null;

  @SerializedName("changedDate")
  private Date changedDate = null;

  @SerializedName("queue")
  private Queue queue = null;

  @SerializedName("neverRelease")
  private Boolean neverRelease = false;

  @SerializedName("resourceId")
  private String resourceId = null;


  /**
   * The type of resource. Only used for email evaluations. Will be null for evaluations on all other resources.
   */
  public enum ResourceTypeEnum {
    @SerializedName("Email")
    EMAIL("Email");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("resourceType")
  private ResourceTypeEnum resourceType = null;

  @SerializedName("redacted")
  private Boolean redacted = false;

  @SerializedName("isScoringIndex")
  private Boolean isScoringIndex = false;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Conversation getConversation() {
    return conversation;
  }
  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }

  /**
   * Evaluation form used for evaluation.
   **/
  @ApiModelProperty(value = "Evaluation form used for evaluation.")
  public EvaluationForm getEvaluationForm() {
    return evaluationForm;
  }
  public void setEvaluationForm(EvaluationForm evaluationForm) {
    this.evaluationForm = evaluationForm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getEvaluator() {
    return evaluator;
  }
  public void setEvaluator(User evaluator) {
    this.evaluator = evaluator;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getAgent() {
    return agent;
  }
  public void setAgent(User agent) {
    this.agent = agent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Calibration getCalibration() {
    return calibration;
  }
  public void setCalibration(Calibration calibration) {
    this.calibration = calibration;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EvaluationScoringSet getAnswers() {
    return answers;
  }
  public void setAnswers(EvaluationScoringSet answers) {
    this.answers = answers;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAgentHasRead() {
    return agentHasRead;
  }
  public void setAgentHasRead(Boolean agentHasRead) {
    this.agentHasRead = agentHasRead;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getAssignedDate() {
    return assignedDate;
  }
  public void setAssignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getChangedDate() {
    return changedDate;
  }
  public void setChangedDate(Date changedDate) {
    this.changedDate = changedDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Queue getQueue() {
    return queue;
  }
  public void setQueue(Queue queue) {
    this.queue = queue;
  }

  /**
   * Signifies if the evaluation is never to be released. This cannot be set true if release date is also set.
   **/
  @ApiModelProperty(value = "Signifies if the evaluation is never to be released. This cannot be set true if release date is also set.")
  public Boolean getNeverRelease() {
    return neverRelease;
  }
  public void setNeverRelease(Boolean neverRelease) {
    this.neverRelease = neverRelease;
  }

  /**
   * Only used for email evaluations. Will be null for all other evaluations.
   **/
  @ApiModelProperty(value = "Only used for email evaluations. Will be null for all other evaluations.")
  public String getResourceId() {
    return resourceId;
  }
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * The type of resource. Only used for email evaluations. Will be null for evaluations on all other resources.
   **/
  @ApiModelProperty(value = "The type of resource. Only used for email evaluations. Will be null for evaluations on all other resources.")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }
  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * Is only true when the user making the request does not have sufficient permissions to see evaluation
   **/
  @ApiModelProperty(value = "Is only true when the user making the request does not have sufficient permissions to see evaluation")
  public Boolean getRedacted() {
    return redacted;
  }
  public void setRedacted(Boolean redacted) {
    this.redacted = redacted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsScoringIndex() {
    return isScoringIndex;
  }
  public void setIsScoringIndex(Boolean isScoringIndex) {
    this.isScoringIndex = isScoringIndex;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evaluation evaluation = (Evaluation) o;
    return Objects.equals(id, evaluation.id) &&
        Objects.equals(name, evaluation.name) &&
        Objects.equals(conversation, evaluation.conversation) &&
        Objects.equals(evaluationForm, evaluation.evaluationForm) &&
        Objects.equals(evaluator, evaluation.evaluator) &&
        Objects.equals(agent, evaluation.agent) &&
        Objects.equals(calibration, evaluation.calibration) &&
        Objects.equals(status, evaluation.status) &&
        Objects.equals(answers, evaluation.answers) &&
        Objects.equals(agentHasRead, evaluation.agentHasRead) &&
        Objects.equals(releaseDate, evaluation.releaseDate) &&
        Objects.equals(assignedDate, evaluation.assignedDate) &&
        Objects.equals(changedDate, evaluation.changedDate) &&
        Objects.equals(queue, evaluation.queue) &&
        Objects.equals(neverRelease, evaluation.neverRelease) &&
        Objects.equals(resourceId, evaluation.resourceId) &&
        Objects.equals(resourceType, evaluation.resourceType) &&
        Objects.equals(redacted, evaluation.redacted) &&
        Objects.equals(isScoringIndex, evaluation.isScoringIndex) &&
        Objects.equals(selfUri, evaluation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversation, evaluationForm, evaluator, agent, calibration, status, answers, agentHasRead, releaseDate, assignedDate, changedDate, queue, neverRelease, resourceId, resourceType, redacted, isScoringIndex, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    calibration: ").append(toIndentedString(calibration)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    agentHasRead: ").append(toIndentedString(agentHasRead)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    assignedDate: ").append(toIndentedString(assignedDate)).append("\n");
    sb.append("    changedDate: ").append(toIndentedString(changedDate)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    neverRelease: ").append(toIndentedString(neverRelease)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    redacted: ").append(toIndentedString(redacted)).append("\n");
    sb.append("    isScoringIndex: ").append(toIndentedString(isScoringIndex)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
