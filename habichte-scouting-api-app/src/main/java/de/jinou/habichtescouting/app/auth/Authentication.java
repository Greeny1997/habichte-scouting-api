/**
 * Habicht Scouting
 * Api fuer Habicht Scouting.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: admin@jinou.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.jinou.habichtescouting.app.auth;

import de.jinou.habichtescouting.app.Pair;

import java.util.List;
import java.util.Map;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
