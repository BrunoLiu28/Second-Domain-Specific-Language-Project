/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import simplemioModel.Action;
import simplemioModel.And;
import simplemioModel.ConditionalSensor;
import simplemioModel.Event;
import simplemioModel.Model;
import simplemioModel.Not;
import simplemioModel.Or;
import simplemioModel.Sensor;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SimpleMioGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile("program.aseba", this.toAsebaCode(((Model) _head)));
  }

  public CharSequence toAsebaCode(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var obstacle = 2000");
    _builder.newLine();
    _builder.append("var line = 400");
    _builder.newLine();
    _builder.append("var mic = 150");
    _builder.newLine();
    _builder.append("var motor = 250");
    _builder.newLine();
    _builder.newLine();
    _builder.append("onevent prox");
    _builder.newLine();
    CharSequence _generateEvents = this.generateEvents(this.filterEvent(model.getProgram().getEvents(), "obstacleturnline"));
    _builder.append(_generateEvents);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("onevent motor");
    _builder.newLine();
    CharSequence _generateEvents_1 = this.generateEvents(this.filterEvent(model.getProgram().getEvents(), "motor"));
    _builder.append(_generateEvents_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("onevent buttons");
    _builder.newLine();
    CharSequence _generateEvents_2 = this.generateEvents(this.filterEvent(model.getProgram().getEvents(), "button"));
    _builder.append(_generateEvents_2);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("onevent mic");
    _builder.newLine();
    CharSequence _generateEvents_3 = this.generateEvents(this.filterEvent(model.getProgram().getEvents(), "sound"));
    _builder.append(_generateEvents_3);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public CharSequence generateEvents(final List<Event> events) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("if 0 != 0 then");
    _builder.newLine();
    {
      for(final Event e : events) {
        _builder.append("elseif ");
        CharSequence _generateEvent = this.generateEvent(e);
        _builder.append(_generateEvent);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("end");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateEvent(final Event event) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateConditionalSensor = this.generateConditionalSensor(event.getConditionalsensor());
    _builder.append(_generateConditionalSensor);
    _builder.append(" then\t");
    _builder.newLineIfNotEmpty();
    {
      EList<Action> _actions = event.getActions();
      for(final Action action : _actions) {
        CharSequence _generateAction = this.generateAction(action);
        _builder.append(_generateAction);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public CharSequence generateConditionalSensor(final ConditionalSensor cs) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((cs instanceof Sensor)) {
        {
          String _sensorName = ((Sensor)cs).getSensorName();
          boolean _equals = Objects.equal(_sensorName, "obstacle");
          if (_equals) {
            {
              String _sensorSpecifier = ((Sensor)cs).getSensorSpecifier();
              boolean _equals_1 = Objects.equal(_sensorSpecifier, "front");
              if (_equals_1) {
                _builder.append("prox.horizontal[1] > obstacle ");
                CharSequence _generateSensorStrength = this.generateSensorStrength(((Sensor)cs));
                _builder.append(_generateSensorStrength);
                _builder.append(" and prox.horizontal[2] > obstacle ");
                CharSequence _generateSensorStrength_1 = this.generateSensorStrength(((Sensor)cs));
                _builder.append(_generateSensorStrength_1);
                _builder.append(" and prox.horizontal[3] > obstacle ");
                CharSequence _generateSensorStrength_2 = this.generateSensorStrength(((Sensor)cs));
                _builder.append(_generateSensorStrength_2);
                _builder.newLineIfNotEmpty();
              } else {
                String _sensorSpecifier_1 = ((Sensor)cs).getSensorSpecifier();
                boolean _equals_2 = Objects.equal(_sensorSpecifier_1, "right");
                if (_equals_2) {
                  _builder.append("prox.horizontal[3] > obstacle ");
                  CharSequence _generateSensorStrength_3 = this.generateSensorStrength(((Sensor)cs));
                  _builder.append(_generateSensorStrength_3);
                  _builder.append(" and prox.horizontal[4] > obstacle ");
                  CharSequence _generateSensorStrength_4 = this.generateSensorStrength(((Sensor)cs));
                  _builder.append(_generateSensorStrength_4);
                  _builder.newLineIfNotEmpty();
                } else {
                  String _sensorSpecifier_2 = ((Sensor)cs).getSensorSpecifier();
                  boolean _equals_3 = Objects.equal(_sensorSpecifier_2, "left");
                  if (_equals_3) {
                    _builder.append("prox.horizontal[0] > obstacle ");
                    CharSequence _generateSensorStrength_5 = this.generateSensorStrength(((Sensor)cs));
                    _builder.append(_generateSensorStrength_5);
                    _builder.append(" and prox.horizontal[1] > obstacle ");
                    CharSequence _generateSensorStrength_6 = this.generateSensorStrength(((Sensor)cs));
                    _builder.append(_generateSensorStrength_6);
                    _builder.newLineIfNotEmpty();
                  } else {
                    String _sensorSpecifier_3 = ((Sensor)cs).getSensorSpecifier();
                    boolean _equals_4 = Objects.equal(_sensorSpecifier_3, "back");
                    if (_equals_4) {
                      _builder.append("prox.horizontal[5] > obstacle ");
                      CharSequence _generateSensorStrength_7 = this.generateSensorStrength(((Sensor)cs));
                      _builder.append(_generateSensorStrength_7);
                      _builder.append(" and prox.horizontal[6] > obstacle ");
                      CharSequence _generateSensorStrength_8 = this.generateSensorStrength(((Sensor)cs));
                      _builder.append(_generateSensorStrength_8);
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          } else {
            String _sensorName_1 = ((Sensor)cs).getSensorName();
            boolean _equals_5 = Objects.equal(_sensorName_1, "line");
            if (_equals_5) {
              {
                String _sensorSpecifier_4 = ((Sensor)cs).getSensorSpecifier();
                boolean _equals_6 = Objects.equal(_sensorSpecifier_4, "right");
                if (_equals_6) {
                  _builder.append("prox.ground.delta[1] < line ");
                  CharSequence _generateSensorStrength_9 = this.generateSensorStrength(((Sensor)cs));
                  _builder.append(_generateSensorStrength_9);
                  _builder.newLineIfNotEmpty();
                } else {
                  String _sensorSpecifier_5 = ((Sensor)cs).getSensorSpecifier();
                  boolean _equals_7 = Objects.equal(_sensorSpecifier_5, "left");
                  if (_equals_7) {
                    _builder.append("prox.ground.delta[0] < line ");
                    CharSequence _generateSensorStrength_10 = this.generateSensorStrength(((Sensor)cs));
                    _builder.append(_generateSensorStrength_10);
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            } else {
              String _sensorName_2 = ((Sensor)cs).getSensorName();
              boolean _equals_8 = Objects.equal(_sensorName_2, "sound");
              if (_equals_8) {
                _builder.append("mic.intensity > mic ");
                CharSequence _generateSensorStrength_11 = this.generateSensorStrength(((Sensor)cs));
                _builder.append(_generateSensorStrength_11);
                _builder.newLineIfNotEmpty();
              } else {
                String _sensorName_3 = ((Sensor)cs).getSensorName();
                boolean _equals_9 = Objects.equal(_sensorName_3, "motor");
                if (_equals_9) {
                  _builder.append("(motor.left.speed > 0 or motor.right.speed > 0)");
                  _builder.newLine();
                } else {
                  String _sensorName_4 = ((Sensor)cs).getSensorName();
                  boolean _equals_10 = Objects.equal(_sensorName_4, "button");
                  if (_equals_10) {
                    {
                      String _sensorSpecifier_6 = ((Sensor)cs).getSensorSpecifier();
                      boolean _equals_11 = Objects.equal(_sensorSpecifier_6, "center");
                      if (_equals_11) {
                        _builder.append("button.center > 0");
                        _builder.newLine();
                      } else {
                        String _sensorSpecifier_7 = ((Sensor)cs).getSensorSpecifier();
                        boolean _equals_12 = Objects.equal(_sensorSpecifier_7, "left");
                        if (_equals_12) {
                          _builder.append("button.left > 0");
                          _builder.newLine();
                        } else {
                          String _sensorSpecifier_8 = ((Sensor)cs).getSensorSpecifier();
                          boolean _equals_13 = Objects.equal(_sensorSpecifier_8, "right");
                          if (_equals_13) {
                            _builder.append("button.right > 0");
                            _builder.newLine();
                          } else {
                            String _sensorSpecifier_9 = ((Sensor)cs).getSensorSpecifier();
                            boolean _equals_14 = Objects.equal(_sensorSpecifier_9, "up");
                            if (_equals_14) {
                              _builder.append("button.forward > 0");
                              _builder.newLine();
                            } else {
                              String _sensorSpecifier_10 = ((Sensor)cs).getSensorSpecifier();
                              boolean _equals_15 = Objects.equal(_sensorSpecifier_10, "down");
                              if (_equals_15) {
                                _builder.append("button.backward > 0");
                                _builder.newLine();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      } else {
        if ((cs instanceof Not)) {
          _builder.append("not (");
          Object _generateConditionalSensor = this.generateConditionalSensor(((Not)cs).getConditionalsensor());
          _builder.append(_generateConditionalSensor);
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        } else {
          if ((cs instanceof And)) {
            _builder.append("(");
            Object _generateConditionalSensor_1 = this.generateConditionalSensor(((And)cs).getLeft());
            _builder.append(_generateConditionalSensor_1);
            _builder.append(") and (");
            Object _generateConditionalSensor_2 = this.generateConditionalSensor(((And)cs).getRight());
            _builder.append(_generateConditionalSensor_2);
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          } else {
            if ((cs instanceof Or)) {
              _builder.append("(");
              Object _generateConditionalSensor_3 = this.generateConditionalSensor(((Or)cs).getLeft());
              _builder.append(_generateConditionalSensor_3);
              _builder.append(") or (");
              Object _generateConditionalSensor_4 = this.generateConditionalSensor(((Or)cs).getRight());
              _builder.append(_generateConditionalSensor_4);
              _builder.append(")");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }

  public CharSequence generateAction(final Action action) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _actionName = action.getActionName();
      boolean _equals = Objects.equal(_actionName, "move");
      if (_equals) {
        {
          String _actionSpecifier = action.getActionSpecifier();
          boolean _equals_1 = Objects.equal(_actionSpecifier, "forward");
          if (_equals_1) {
            _builder.append("motor.left.target = motor ");
            CharSequence _generateActionStrength = this.generateActionStrength(action);
            _builder.append(_generateActionStrength);
            _builder.newLineIfNotEmpty();
            _builder.append("motor.right.target = motor ");
            CharSequence _generateActionStrength_1 = this.generateActionStrength(action);
            _builder.append(_generateActionStrength_1);
            _builder.newLineIfNotEmpty();
          } else {
            String _actionSpecifier_1 = action.getActionSpecifier();
            boolean _equals_2 = Objects.equal(_actionSpecifier_1, "backward");
            if (_equals_2) {
              _builder.append("motor.left.target = -motor ");
              CharSequence _generateActionStrength_2 = this.generateActionStrength(action);
              _builder.append(_generateActionStrength_2);
              _builder.newLineIfNotEmpty();
              _builder.append("motor.right.target = -motor ");
              CharSequence _generateActionStrength_3 = this.generateActionStrength(action);
              _builder.append(_generateActionStrength_3);
              _builder.newLineIfNotEmpty();
            }
          }
        }
      } else {
        String _actionName_1 = action.getActionName();
        boolean _equals_3 = Objects.equal(_actionName_1, "stop");
        if (_equals_3) {
          _builder.append("motor.left.target = 0");
          _builder.newLine();
          _builder.append("motor.right.target = 0\t");
          _builder.newLine();
        } else {
          String _actionName_2 = action.getActionName();
          boolean _equals_4 = Objects.equal(_actionName_2, "turn");
          if (_equals_4) {
            {
              String _actionSpecifier_2 = action.getActionSpecifier();
              boolean _equals_5 = Objects.equal(_actionSpecifier_2, "right");
              if (_equals_5) {
                _builder.append("motor.left.target = motor ");
                CharSequence _generateActionStrength_4 = this.generateActionStrength(action);
                _builder.append(_generateActionStrength_4);
                _builder.newLineIfNotEmpty();
                _builder.append("motor.right.target = -motor ");
                CharSequence _generateActionStrength_5 = this.generateActionStrength(action);
                _builder.append(_generateActionStrength_5);
                _builder.newLineIfNotEmpty();
              } else {
                String _actionSpecifier_3 = action.getActionSpecifier();
                boolean _equals_6 = Objects.equal(_actionSpecifier_3, "left");
                if (_equals_6) {
                  _builder.append("motor.left.target = -motor ");
                  CharSequence _generateActionStrength_6 = this.generateActionStrength(action);
                  _builder.append(_generateActionStrength_6);
                  _builder.newLineIfNotEmpty();
                  _builder.append("motor.right.target = motor ");
                  CharSequence _generateActionStrength_7 = this.generateActionStrength(action);
                  _builder.append(_generateActionStrength_7);
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          } else {
            String _actionName_3 = action.getActionName();
            boolean _equals_7 = Objects.equal(_actionName_3, "led");
            if (_equals_7) {
              {
                String _actionSpecifier_4 = action.getActionSpecifier();
                boolean _equals_8 = Objects.equal(_actionSpecifier_4, "red");
                if (_equals_8) {
                  _builder.append("call leds.top(127 ");
                  CharSequence _generateActionStrength_8 = this.generateActionStrength(action);
                  _builder.append(_generateActionStrength_8);
                  _builder.append(", 0 ,0)");
                  _builder.newLineIfNotEmpty();
                } else {
                  String _actionSpecifier_5 = action.getActionSpecifier();
                  boolean _equals_9 = Objects.equal(_actionSpecifier_5, "green");
                  if (_equals_9) {
                    _builder.append("call leds.top(0, 127 ");
                    CharSequence _generateActionStrength_9 = this.generateActionStrength(action);
                    _builder.append(_generateActionStrength_9);
                    _builder.append(", 0)");
                    _builder.newLineIfNotEmpty();
                  } else {
                    String _actionSpecifier_6 = action.getActionSpecifier();
                    boolean _equals_10 = Objects.equal(_actionSpecifier_6, "blue");
                    if (_equals_10) {
                      _builder.append("call leds.top(0, 0, 127 ");
                      CharSequence _generateActionStrength_10 = this.generateActionStrength(action);
                      _builder.append(_generateActionStrength_10);
                      _builder.append(")");
                      _builder.newLineIfNotEmpty();
                    } else {
                      String _actionSpecifier_7 = action.getActionSpecifier();
                      boolean _equals_11 = Objects.equal(_actionSpecifier_7, "off");
                      if (_equals_11) {
                        _builder.append("call leds.top(0, 0, 0)");
                        _builder.newLine();
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }

  public CharSequence generateSensorStrength(final Sensor sensor) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Integer _strength = sensor.getStrength();
      boolean _tripleNotEquals = (_strength != null);
      if (_tripleNotEquals) {
        _builder.append("* ");
        Integer _strength_1 = sensor.getStrength();
        _builder.append(_strength_1);
        _builder.append(" / 5");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public CharSequence generateActionStrength(final Action action) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Integer _strength = action.getStrength();
      boolean _tripleNotEquals = (_strength != null);
      if (_tripleNotEquals) {
        _builder.append("* ");
        Integer _strength_1 = action.getStrength();
        _builder.append(_strength_1);
        _builder.append(" / 5");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public ArrayList<Event> filterEvent(final List<Event> events, final String eventNames) {
    ArrayList<Event> res = new ArrayList<Event>();
    for (final Event e : events) {
      {
        List<Sensor> flattened = this.flatten(e.getConditionalsensor());
        boolean isEvent = false;
        for (final Sensor cs : flattened) {
          boolean _contains = eventNames.contains(cs.getSensorName());
          if (_contains) {
            isEvent = true;
          }
        }
        if (isEvent) {
          res.add(e);
        }
      }
    }
    return res;
  }

  public List<Sensor> flatten(final ConditionalSensor cs) {
    ArrayList<Sensor> res = new ArrayList<Sensor>();
    if ((cs instanceof Sensor)) {
      res.add(((Sensor)cs));
    } else {
      if ((cs instanceof Not)) {
        res.addAll(this.flatten(((Not)cs).getConditionalsensor()));
      } else {
        if ((cs instanceof And)) {
          res.addAll(this.flatten(((And)cs).getLeft()));
          res.addAll(this.flatten(((And)cs).getRight()));
        } else {
          if ((cs instanceof Or)) {
            res.addAll(this.flatten(((Or)cs).getLeft()));
            res.addAll(this.flatten(((Or)cs).getRight()));
          }
        }
      }
    }
    return res;
  }
}
