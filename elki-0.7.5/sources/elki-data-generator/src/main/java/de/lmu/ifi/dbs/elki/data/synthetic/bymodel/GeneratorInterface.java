/*
 * This file is part of ELKI:
 * Environment for Developing KDD-Applications Supported by Index-Structures
 *
 * Copyright (C) 2019
 * ELKI Development Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.lmu.ifi.dbs.elki.data.synthetic.bymodel;

import java.util.List;

import de.lmu.ifi.dbs.elki.data.model.Model;

/**
 * Interface for cluster generators
 *
 * @author Erich Schubert
 * @since 0.2
 */
public interface GeneratorInterface {
  /**
   * Get number of points to be generated by this generator.
   *
   * @return cluster size
   */
  int getSize();

  /**
   * Get dimensionality of generated data
   *
   * @return dimensionality
   */
  int getDim();

  /**
   * Generate a specified number of points
   *
   * @param count Number of points to generate
   * @return List of generated points
   */
  List<double[]> generate(int count);

  /**
   * Get the density of the given vector
   *
   * @param p vector
   * @return density
   */
  double getDensity(double[] p);

  /**
   * Get cluster name
   *
   * @return cluster name
   */
  String getName();

  /**
   * Make a cluster model for this cluster.
   *
   * @return Cluster model
   */
  Model makeModel();

  /**
   * Get the cluster mean vector.
   *
   * @return Cluster mean, or {@code null}.
   */
  double[] computeMean();
}